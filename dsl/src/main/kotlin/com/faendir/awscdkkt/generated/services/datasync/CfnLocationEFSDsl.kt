package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationEFS
import software.amazon.awscdk.services.datasync.CfnLocationEFSProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationEFS(id: String, props: CfnLocationEFSProps): CfnLocationEFS =
    CfnLocationEFS(this, id, props)

@Generated
public fun Construct.cfnLocationEFS(
  id: String,
  props: CfnLocationEFSProps,
  initializer: @AwsCdkDsl CfnLocationEFS.() -> Unit,
): CfnLocationEFS = CfnLocationEFS(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationEFS(id: String, initializer: @AwsCdkDsl
    CfnLocationEFS.Builder.() -> Unit): CfnLocationEFS = CfnLocationEFS.Builder.create(this,
    id).apply(initializer).build()
