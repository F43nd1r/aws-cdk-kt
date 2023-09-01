package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun buildProvisionedThroughputProperty(initializer: @AwsCdkDsl
    CfnCluster.ProvisionedThroughputProperty.Builder.() -> Unit = {}):
    CfnCluster.ProvisionedThroughputProperty =
    CfnCluster.ProvisionedThroughputProperty.Builder().apply(initializer).build()
