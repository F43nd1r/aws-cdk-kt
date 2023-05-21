package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@Generated
public fun snapshotOptionsProperty(initializer: CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit
    = {}): CfnDomain.SnapshotOptionsProperty =
    CfnDomain.SnapshotOptionsProperty.builder().apply(initializer).build()
