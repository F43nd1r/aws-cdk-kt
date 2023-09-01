package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

@Generated
public fun buildSaslProperty(initializer: @AwsCdkDsl
    CfnServerlessCluster.SaslProperty.Builder.() -> Unit = {}): CfnServerlessCluster.SaslProperty =
    CfnServerlessCluster.SaslProperty.Builder().apply(initializer).build()
