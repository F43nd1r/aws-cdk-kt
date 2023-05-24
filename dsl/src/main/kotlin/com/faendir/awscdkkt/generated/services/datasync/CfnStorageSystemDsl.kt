package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnStorageSystem
import software.amazon.awscdk.services.datasync.CfnStorageSystemProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStorageSystem(id: String, props: CfnStorageSystemProps): CfnStorageSystem =
    CfnStorageSystem(this, id, props)

@Generated
public fun Construct.cfnStorageSystem(
  id: String,
  props: CfnStorageSystemProps,
  initializer: @AwsCdkDsl CfnStorageSystem.() -> Unit,
): CfnStorageSystem = CfnStorageSystem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStorageSystem(id: String, initializer: @AwsCdkDsl
    CfnStorageSystem.Builder.() -> Unit): CfnStorageSystem = CfnStorageSystem.Builder.create(this,
    id).apply(initializer).build()
