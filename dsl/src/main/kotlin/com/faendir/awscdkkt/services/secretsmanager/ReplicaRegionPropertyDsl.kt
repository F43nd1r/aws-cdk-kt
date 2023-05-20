@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecret

public fun replicaRegionProperty(initializer: CfnSecret.ReplicaRegionProperty.Builder.() -> Unit):
    CfnSecret.ReplicaRegionProperty =
    CfnSecret.ReplicaRegionProperty.builder().apply(initializer).build()
