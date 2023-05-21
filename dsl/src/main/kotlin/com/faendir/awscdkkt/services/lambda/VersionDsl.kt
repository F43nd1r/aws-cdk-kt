package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.Version
import software.amazon.awscdk.services.lambda.VersionProps
import software.constructs.Construct

@Generated
public fun Construct.version(
  id: String,
  props: VersionProps,
  initializer: Version.() -> Unit = {},
): Version = Version(this, id, props).apply(initializer)
