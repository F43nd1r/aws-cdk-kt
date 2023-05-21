package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnResolver

@Generated
public
    fun lambdaConflictHandlerConfigProperty(initializer: CfnResolver.LambdaConflictHandlerConfigProperty.Builder.() -> Unit
    = {}): CfnResolver.LambdaConflictHandlerConfigProperty =
    CfnResolver.LambdaConflictHandlerConfigProperty.builder().apply(initializer).build()
