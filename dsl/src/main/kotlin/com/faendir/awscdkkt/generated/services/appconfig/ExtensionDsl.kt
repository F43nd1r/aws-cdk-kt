package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.Extension
import software.amazon.awscdk.services.appconfig.ExtensionProps
import software.constructs.Construct

@Generated
public fun Construct.extension(
  id: String,
  props: ExtensionProps,
  initializer: @AwsCdkDsl Extension.() -> Unit = {},
): Extension = Extension(this, id, props).apply(initializer)

@Generated
public fun Construct.buildExtension(id: String, initializer: @AwsCdkDsl Extension.Builder.() -> Unit
    = {}): Extension = Extension.Builder.create(this, id).apply(initializer).build()
