package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion

@Generated
public fun replicaRegion(initializer: ReplicaRegion.Builder.() -> Unit = {}): ReplicaRegion =
    ReplicaRegion.builder().apply(initializer).build()
