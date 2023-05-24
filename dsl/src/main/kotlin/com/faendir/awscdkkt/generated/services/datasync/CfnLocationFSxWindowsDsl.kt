package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationFSxWindows
import software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationFSxWindows(id: String, props: CfnLocationFSxWindowsProps):
    CfnLocationFSxWindows = CfnLocationFSxWindows(this, id, props)

@Generated
public fun Construct.cfnLocationFSxWindows(
  id: String,
  props: CfnLocationFSxWindowsProps,
  initializer: @AwsCdkDsl CfnLocationFSxWindows.() -> Unit,
): CfnLocationFSxWindows = CfnLocationFSxWindows(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationFSxWindows(id: String, initializer: @AwsCdkDsl
    CfnLocationFSxWindows.Builder.() -> Unit): CfnLocationFSxWindows =
    CfnLocationFSxWindows.Builder.create(this, id).apply(initializer).build()
