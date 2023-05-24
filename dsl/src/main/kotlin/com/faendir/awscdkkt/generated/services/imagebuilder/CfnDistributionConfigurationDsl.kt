package com.faendir.awscdkkt.generated.services.imagebuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDistributionConfiguration(id: String,
    props: CfnDistributionConfigurationProps): CfnDistributionConfiguration =
    CfnDistributionConfiguration(this, id, props)

@Generated
public fun Construct.cfnDistributionConfiguration(
  id: String,
  props: CfnDistributionConfigurationProps,
  initializer: @AwsCdkDsl CfnDistributionConfiguration.() -> Unit,
): CfnDistributionConfiguration = CfnDistributionConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDistributionConfiguration(id: String, initializer: @AwsCdkDsl
    CfnDistributionConfiguration.Builder.() -> Unit): CfnDistributionConfiguration =
    CfnDistributionConfiguration.Builder.create(this, id).apply(initializer).build()
