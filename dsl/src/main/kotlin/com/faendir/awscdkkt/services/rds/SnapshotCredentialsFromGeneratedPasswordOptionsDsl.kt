package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions

@Generated
public
    fun snapshotCredentialsFromGeneratedPasswordOptions(initializer: SnapshotCredentialsFromGeneratedPasswordOptions.Builder.() -> Unit
    = {}): SnapshotCredentialsFromGeneratedPasswordOptions =
    SnapshotCredentialsFromGeneratedPasswordOptions.builder().apply(initializer).build()
