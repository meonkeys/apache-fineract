/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.integrationtests.common.provisioning;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import java.util.ArrayList;
import java.util.Map;
import org.apache.fineract.integrationtests.common.Utils;

public class ProvisioningTransactionHelper {

    private static final String PROVISIONING_CATEGORY_URL = "/fineract-provider/api/v1/provisioningcategory?" + Utils.TENANT_IDENTIFIER;

    private static final String CREATE_PROVISIONING_CRITERIA_URL = "/fineract-provider/api/v1/provisioningcriteria?"
            + Utils.TENANT_IDENTIFIER;
    private static final String CREATE_PROVISIONING_ENTRY_URL = "/fineract-provider/api/v1/provisioningentries?" + Utils.TENANT_IDENTIFIER;

    private final RequestSpecification requestSpec;
    private final ResponseSpecification responseSpec;

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public ProvisioningTransactionHelper(RequestSpecification requestSpec, ResponseSpecification responeSpec) {
        this.requestSpec = requestSpec;
        this.responseSpec = responeSpec;
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public ArrayList retrieveAllProvisioningCategories() {
        return Utils.performServerGet(requestSpec, responseSpec, PROVISIONING_CATEGORY_URL, "");
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Integer createProvisioningCriteria(final String provsioningCriteriaJson) {
        return Utils.performServerPost(this.requestSpec, this.responseSpec, CREATE_PROVISIONING_CRITERIA_URL, provsioningCriteriaJson,
                "resourceId");
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Map retrieveProvisioningCriteria(final Integer criteriaId) {
        String url = "/fineract-provider/api/v1/provisioningcriteria/" + criteriaId + "?" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerGet(requestSpec, responseSpec, url, "");
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Integer updateProvisioningCriteria(final Integer criteriaId, final String provsioningCriteriaJson) {
        String url = "/fineract-provider/api/v1/provisioningcriteria/" + criteriaId + "?" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerPut(this.requestSpec, this.responseSpec, url, provsioningCriteriaJson, "resourceId");
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Integer deleteProvisioningCriteria(final Integer criteriaId) {
        String url = "/fineract-provider/api/v1/provisioningcriteria/" + criteriaId + "?" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerDelete(this.requestSpec, this.responseSpec, url, "resourceId");
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Integer createProvisioningEntries(final String provsioningCriteriaJson) {
        return Utils.performServerPost(this.requestSpec, this.responseSpec, CREATE_PROVISIONING_ENTRY_URL, provsioningCriteriaJson,
                "resourceId");
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Integer updateProvisioningEntry(final String command, final Integer entryId, String jsonBody) {
        String url = "/fineract-provider/api/v1/provisioningentries/" + entryId + "?command=" + command + "&" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerPost(requestSpec, responseSpec, url, jsonBody, "resourceId");
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Map retrieveProvisioningEntry(final Integer provisioningEntry) {
        String url = "/fineract-provider/api/v1/provisioningentries/" + provisioningEntry + "?" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerGet(requestSpec, responseSpec, url, "");
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Map retrieveProvisioningEntries(final Integer provisioningEntry) {
        String url = "/fineract-provider/api/v1/provisioningentries/entries?entryId=" + provisioningEntry + "&" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerGet(requestSpec, responseSpec, url, "");
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Map retrieveAllProvisioningEntries() {
        String url = "/fineract-provider/api/v1/provisioningentries?dateFormat=dd MMMM yyyy" + "&" + "locale=en" + "&"
                + Utils.TENANT_IDENTIFIER;
        return Utils.performServerGet(requestSpec, responseSpec, url, "");
    }

}
