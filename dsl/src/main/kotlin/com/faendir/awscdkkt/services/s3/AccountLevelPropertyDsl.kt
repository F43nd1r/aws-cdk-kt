package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens

@Generated
public fun accountLevelProperty(initializer: CfnStorageLens.AccountLevelProperty.Builder.() -> Unit
    = {}): CfnStorageLens.AccountLevelProperty =
    CfnStorageLens.AccountLevelProperty.builder().apply(initializer).build()
