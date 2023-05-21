package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun replicaModificationsProperty(initializer: CfnBucket.ReplicaModificationsProperty.Builder.() -> Unit
    = {}): CfnBucket.ReplicaModificationsProperty =
    CfnBucket.ReplicaModificationsProperty.builder().apply(initializer).build()
