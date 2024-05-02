package com.faendir.awscdkkt.generated.services.arczonalshift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration
import software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnZonalAutoshiftConfiguration(
  id: String,
  props: CfnZonalAutoshiftConfigurationProps,
  initializer: @AwsCdkDsl CfnZonalAutoshiftConfiguration.() -> Unit = {},
): CfnZonalAutoshiftConfiguration = CfnZonalAutoshiftConfiguration(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnZonalAutoshiftConfiguration(id: String, initializer: @AwsCdkDsl
    CfnZonalAutoshiftConfiguration.Builder.() -> Unit = {}): CfnZonalAutoshiftConfiguration =
    CfnZonalAutoshiftConfiguration.Builder.create(this, id).apply(initializer).build()
