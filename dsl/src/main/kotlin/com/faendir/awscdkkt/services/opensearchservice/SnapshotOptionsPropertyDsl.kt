@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

public
    fun snapshotOptionsProperty(initializer: CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit):
    CfnDomain.SnapshotOptionsProperty =
    CfnDomain.SnapshotOptionsProperty.builder().apply(initializer).build()
