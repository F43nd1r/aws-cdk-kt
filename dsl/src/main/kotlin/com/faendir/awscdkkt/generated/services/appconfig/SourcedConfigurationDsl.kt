package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.SourcedConfiguration
import software.amazon.awscdk.services.appconfig.SourcedConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.sourcedConfiguration(
  id: String,
  props: SourcedConfigurationProps,
  initializer: @AwsCdkDsl SourcedConfiguration.() -> Unit = {},
): SourcedConfiguration = SourcedConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSourcedConfiguration(id: String, initializer: @AwsCdkDsl SourcedConfiguration.Builder.() -> Unit = {}): SourcedConfiguration = SourcedConfiguration.Builder.create(this, id).apply(initializer).build()
