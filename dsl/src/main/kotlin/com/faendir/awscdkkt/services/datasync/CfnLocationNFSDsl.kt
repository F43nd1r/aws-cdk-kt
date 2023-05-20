@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationNFS
import software.amazon.awscdk.services.datasync.CfnLocationNFSProps
import software.constructs.Construct

public fun Construct.cfnLocationNFS(
  id: String,
  props: CfnLocationNFSProps,
  initializer: CfnLocationNFS.() -> Unit = {},
): CfnLocationNFS = CfnLocationNFS(this, id, props).apply(initializer)
