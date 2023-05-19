@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
