@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnArchive
import software.amazon.awscdk.services.events.CfnArchiveProps
import software.constructs.Construct

public fun Construct.cfnArchive(
  id: String,
  props: CfnArchiveProps,
  initializer: CfnArchive.() -> Unit = {},
): CfnArchive = CfnArchive(this, id, props).apply(initializer)
