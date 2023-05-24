package com.faendir.awscdkkt.generated.services.fsx

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem
import software.amazon.awscdk.services.fsx.CfnFileSystemProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFileSystem(id: String, props: CfnFileSystemProps): CfnFileSystem =
    CfnFileSystem(this, id, props)

@Generated
public fun Construct.cfnFileSystem(
  id: String,
  props: CfnFileSystemProps,
  initializer: @AwsCdkDsl CfnFileSystem.() -> Unit,
): CfnFileSystem = CfnFileSystem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFileSystem(id: String, initializer: @AwsCdkDsl
    CfnFileSystem.Builder.() -> Unit): CfnFileSystem = CfnFileSystem.Builder.create(this,
    id).apply(initializer).build()
