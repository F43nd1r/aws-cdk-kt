package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

@Generated
public
    fun cognitoMemberDefinitionProperty(initializer: CfnWorkteam.CognitoMemberDefinitionProperty.Builder.() -> Unit
    = {}): CfnWorkteam.CognitoMemberDefinitionProperty =
    CfnWorkteam.CognitoMemberDefinitionProperty.builder().apply(initializer).build()
