@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens
import software.amazon.awscdk.services.s3.CfnStorageLensProps
import software.constructs.Construct

public fun Construct.cfnStorageLens(
  id: String,
  props: CfnStorageLensProps,
  initializer: CfnStorageLens.() -> Unit = {},
): CfnStorageLens = CfnStorageLens(this, id, props).apply(initializer)
