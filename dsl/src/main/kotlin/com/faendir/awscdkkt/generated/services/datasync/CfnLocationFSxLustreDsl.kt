package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationFSxLustre
import software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationFSxLustre(
  id: String,
  props: CfnLocationFSxLustreProps,
  initializer: @AwsCdkDsl CfnLocationFSxLustre.() -> Unit = {},
): CfnLocationFSxLustre = CfnLocationFSxLustre(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationFSxLustre(id: String, initializer: @AwsCdkDsl CfnLocationFSxLustre.Builder.() -> Unit = {}): CfnLocationFSxLustre = CfnLocationFSxLustre.Builder.create(this, id).apply(initializer).build()
