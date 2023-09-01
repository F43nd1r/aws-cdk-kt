package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public fun buildLoggingTypeConfigProperty(initializer: @AwsCdkDsl
    CfnCluster.LoggingTypeConfigProperty.Builder.() -> Unit = {}):
    CfnCluster.LoggingTypeConfigProperty =
    CfnCluster.LoggingTypeConfigProperty.Builder().apply(initializer).build()
