package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

@Generated
public fun buildVpcConfigProperty(initializer: @AwsCdkDsl
    CfnServerlessCluster.VpcConfigProperty.Builder.() -> Unit = {}):
    CfnServerlessCluster.VpcConfigProperty =
    CfnServerlessCluster.VpcConfigProperty.Builder().apply(initializer).build()
