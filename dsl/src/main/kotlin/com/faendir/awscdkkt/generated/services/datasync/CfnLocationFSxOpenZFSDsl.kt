package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationFSxOpenZFS(id: String, props: CfnLocationFSxOpenZFSProps):
    CfnLocationFSxOpenZFS = CfnLocationFSxOpenZFS(this, id, props)

@Generated
public fun Construct.cfnLocationFSxOpenZFS(
  id: String,
  props: CfnLocationFSxOpenZFSProps,
  initializer: @AwsCdkDsl CfnLocationFSxOpenZFS.() -> Unit,
): CfnLocationFSxOpenZFS = CfnLocationFSxOpenZFS(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationFSxOpenZFS(id: String, initializer: @AwsCdkDsl
    CfnLocationFSxOpenZFS.Builder.() -> Unit): CfnLocationFSxOpenZFS =
    CfnLocationFSxOpenZFS.Builder.create(this, id).apply(initializer).build()
