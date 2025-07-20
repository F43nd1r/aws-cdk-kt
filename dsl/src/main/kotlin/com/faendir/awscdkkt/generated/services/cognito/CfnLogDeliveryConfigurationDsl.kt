package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration
import software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLogDeliveryConfiguration(
  id: String,
  props: CfnLogDeliveryConfigurationProps,
  initializer: @AwsCdkDsl CfnLogDeliveryConfiguration.() -> Unit = {},
): CfnLogDeliveryConfiguration = CfnLogDeliveryConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLogDeliveryConfiguration(id: String, initializer: @AwsCdkDsl CfnLogDeliveryConfiguration.Builder.() -> Unit = {}): CfnLogDeliveryConfiguration = CfnLogDeliveryConfiguration.Builder.create(this, id).apply(initializer).build()
