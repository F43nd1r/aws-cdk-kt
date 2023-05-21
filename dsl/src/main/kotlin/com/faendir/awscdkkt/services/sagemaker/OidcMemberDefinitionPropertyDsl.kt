package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

@Generated
public
    fun oidcMemberDefinitionProperty(initializer: CfnWorkteam.OidcMemberDefinitionProperty.Builder.() -> Unit
    = {}): CfnWorkteam.OidcMemberDefinitionProperty =
    CfnWorkteam.OidcMemberDefinitionProperty.builder().apply(initializer).build()
