/* Copyright (c) 2001-2011, The HSQL Development Group
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the HSQL Development Group nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL HSQL DEVELOPMENT GROUP, HSQLDB.ORG,
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */


package org.hsqldb;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase {

    public AllTests(String s) {
        super(s);
    }

    public static Test suite() {

        TestSuite suite = new TestSuite();

        //suite.addTestSuite(TestHTTPKeepAlive.class);
        suite.addTestSuite(TestBatchExecution.class);
        suite.addTestSuite(TestBug1191815.class);
        suite.addTestSuite(TestBug778213.class);
        suite.addTestSuite(TestBug785429.class);
        suite.addTestSuite(TestBug808460.class);
        suite.addTestSuite(TestCollation.class);
        suite.addTestSuite(TestDatabaseMetaData.class);
        suite.addTestSuite(TestDateTime.class);
        suite.addTestSuite(TestINPredicateParameterizationAndCorrelation.class);
        suite.addTestSuite(TestJDBCGeneratedColumns.class);
        suite.addTestSuite(
            TestLikePredicateOptimizations.class);
        suite.addTestSuite(TestLobs.class);
        suite.addTestSuite(TestMerge.class);
        suite.addTestSuite(TestMultiInsert.class);
        suite.addTestSuite(TestSql.class);
        suite.addTestSuite(TestStoredProcedure.class);
        suite.addTestSuite(TestTextTable.class);
        suite.addTestSuite(TestTextTables.class);
        suite.addTestSuite(TestViewAsterisks.class);
        suite.addTestSuite(TestUpdatableResults.class);
        suite.addTestSuite(TestUpdatableResultSets.class);
        suite.addTestSuite(TestTriggers.class);

        // Suites that extend TestCase
        suite.addTestSuite(TestJDBCSavepoints.class);
        suite.addTestSuite(TestPreparedStatements.class);
        suite.addTestSuite(TestPreparedSubQueries.class);
        suite.addTestSuite(TestSubselect.class);
        suite.addTestSuite(TestCascade.class);
        suite.addTestSuite(TestGroupByHaving.class);
        suite.addTestSuite(TestSqlPersistent.class);     // Sometimes hangs on Connection.close after SHUTDOWN problem

        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}
