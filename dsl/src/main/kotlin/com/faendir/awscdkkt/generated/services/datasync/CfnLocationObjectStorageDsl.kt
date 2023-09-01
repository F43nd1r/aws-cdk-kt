package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnLocationObjectStorage.() -> Unit = {},
): CfnLocationObjectStorage = CfnLocationObjectStorage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationObjectStorage(id: String, initializer: @AwsCdkDsl
    CfnLocationObjectStorage.Builder.() -> Unit = {}): CfnLocationObjectStorage =
    CfnLocationObjectStorage.Builder.create(this, id).apply(initializer).build()
