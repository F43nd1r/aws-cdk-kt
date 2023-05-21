package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationObjectStorage
import software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationObjectStorage(
  id: String,
  props: CfnLocationObjectStorageProps,
  initializer: CfnLocationObjectStorage.() -> Unit = {},
): CfnLocationObjectStorage = CfnLocationObjectStorage(this, id, props).apply(initializer)
