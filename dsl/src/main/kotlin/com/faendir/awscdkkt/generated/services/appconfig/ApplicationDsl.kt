package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.Application
import software.amazon.awscdk.services.appconfig.ApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.application(id: String, initializer: @AwsCdkDsl Application.() -> Unit = {}): Application = Application(this, id).apply(initializer)

@Generated
public fun Construct.application(
  id: String,
  props: ApplicationProps,
  initializer: @AwsCdkDsl Application.() -> Unit = {},
): Application = Application(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApplication(id: String, initializer: @AwsCdkDsl Application.Builder.() -> Unit = {}): Application = Application.Builder.create(this, id).apply(initializer).build()
