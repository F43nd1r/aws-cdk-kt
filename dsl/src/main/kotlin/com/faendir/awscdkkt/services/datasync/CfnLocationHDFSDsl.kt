@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationHDFS
import software.amazon.awscdk.services.datasync.CfnLocationHDFSProps
import software.constructs.Construct

public fun Construct.cfnLocationHDFS(
  id: String,
  props: CfnLocationHDFSProps,
  initializer: CfnLocationHDFS.() -> Unit = {},
): CfnLocationHDFS = CfnLocationHDFS(this, id, props).apply(initializer)
