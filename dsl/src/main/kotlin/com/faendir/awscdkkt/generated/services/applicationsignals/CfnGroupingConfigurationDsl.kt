package com.faendir.awscdkkt.generated.services.applicationsignals

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationsignals.CfnGroupingConfiguration
import software.amazon.awscdk.services.applicationsignals.CfnGroupingConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGroupingConfiguration(
  id: String,
  props: CfnGroupingConfigurationProps,
  initializer: @AwsCdkDsl CfnGroupingConfiguration.() -> Unit = {},
): CfnGroupingConfiguration = CfnGroupingConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGroupingConfiguration(id: String, initializer: @AwsCdkDsl CfnGroupingConfiguration.Builder.() -> Unit = {}): CfnGroupingConfiguration = CfnGroupingConfiguration.Builder.create(this, id).apply(initializer).build()
