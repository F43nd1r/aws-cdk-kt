package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.CfnReplicaKeyProps

@Generated
public fun cfnReplicaKeyProps(initializer: CfnReplicaKeyProps.Builder.() -> Unit = {}):
    CfnReplicaKeyProps = CfnReplicaKeyProps.builder().apply(initializer).build()
