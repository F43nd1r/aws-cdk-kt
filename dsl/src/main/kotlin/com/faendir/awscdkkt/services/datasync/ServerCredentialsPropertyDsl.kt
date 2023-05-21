package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnStorageSystem

@Generated
public
    fun serverCredentialsProperty(initializer: CfnStorageSystem.ServerCredentialsProperty.Builder.() -> Unit
    = {}): CfnStorageSystem.ServerCredentialsProperty =
    CfnStorageSystem.ServerCredentialsProperty.builder().apply(initializer).build()
