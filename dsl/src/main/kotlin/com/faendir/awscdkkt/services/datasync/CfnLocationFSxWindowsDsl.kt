@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationFSxWindows
import software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps
import software.constructs.Construct

public fun Construct.cfnLocationFSxWindows(
  id: String,
  props: CfnLocationFSxWindowsProps,
  initializer: CfnLocationFSxWindows.() -> Unit = {},
): CfnLocationFSxWindows = CfnLocationFSxWindows(this, id, props).apply(initializer)
