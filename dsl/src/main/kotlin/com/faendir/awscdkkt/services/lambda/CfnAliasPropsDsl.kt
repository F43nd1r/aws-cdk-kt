package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnAliasProps

@Generated
public fun cfnAliasProps(initializer: CfnAliasProps.Builder.() -> Unit = {}): CfnAliasProps =
    CfnAliasProps.builder().apply(initializer).build()
