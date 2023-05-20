@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationEFS
import software.amazon.awscdk.services.datasync.CfnLocationEFSProps
import software.constructs.Construct

public fun Construct.cfnLocationEFS(
  id: String,
  props: CfnLocationEFSProps,
  initializer: CfnLocationEFS.() -> Unit = {},
): CfnLocationEFS = CfnLocationEFS(this, id, props).apply(initializer)
