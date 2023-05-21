package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule

@Generated
public
    fun organizationCustomRuleMetadataProperty(initializer: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.Builder.() -> Unit
    = {}): CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty =
    CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.builder().apply(initializer).build()
