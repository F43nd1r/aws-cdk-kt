package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@Generated
public fun buildAutoRollbackConfigProperty(initializer: @AwsCdkDsl
    CfnEndpoint.AutoRollbackConfigProperty.Builder.() -> Unit):
    CfnEndpoint.AutoRollbackConfigProperty =
    CfnEndpoint.AutoRollbackConfigProperty.Builder().apply(initializer).build()
