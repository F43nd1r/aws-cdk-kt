package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun buildPublicAccessProperty(initializer: @AwsCdkDsl
    CfnCluster.PublicAccessProperty.Builder.() -> Unit = {}): CfnCluster.PublicAccessProperty =
    CfnCluster.PublicAccessProperty.Builder().apply(initializer).build()
