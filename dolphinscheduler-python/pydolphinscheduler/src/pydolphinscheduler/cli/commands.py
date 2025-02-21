# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.

"""Commands line interface's command of pydolphinscheduler."""

import click
from click import echo

from pydolphinscheduler import __version__

version_option_val = ["major", "minor", "micro"]


@click.group()
def cli():
    """Apache DolphinScheduler Python API's command line interface."""


@cli.command()
@click.option(
    "--part",
    "-p",
    required=False,
    type=click.Choice(version_option_val, case_sensitive=False),
    multiple=False,
    help="The part of version your want to get.",
)
def version(part: str) -> None:
    """Show current version of pydolphinscheduler."""
    if part:
        idx = version_option_val.index(part)
        echo(f"{__version__.split('.')[idx]}")
    else:
        echo(f"{__version__}")
