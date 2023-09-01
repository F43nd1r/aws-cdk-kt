package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl Version.() -> Unit = {},
): Version = Version(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVersion(id: String, initializer: @AwsCdkDsl Version.Builder.() -> Unit =
    {}): Version = Version.Builder.create(this, id).apply(initializer).build()
