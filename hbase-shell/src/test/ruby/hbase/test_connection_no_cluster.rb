#
#
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

require 'shell'
require 'stringio'
require 'hbase_constants'
require 'hbase/hbase'
require 'hbase/table'

include HBaseConstants

module Hbase
  class NoClusterConnectionTest < Test::Unit::TestCase
    include TestHelpers

    def setup
      puts "starting shell"
    end

    def teardown
      # nothing to teardown
    end

    define_test "start_hbase_shell_no_cluster" do
      assert_nothing_raised do
        setup_hbase
      end
    end
  end
end
