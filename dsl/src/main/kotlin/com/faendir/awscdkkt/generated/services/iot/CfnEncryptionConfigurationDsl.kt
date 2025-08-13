package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnEncryptionConfiguration
import software.amazon.awscdk.services.iot.CfnEncryptionConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEncryptionConfiguration(
  id: String,
  props: CfnEncryptionConfigurationProps,
  initializer: @AwsCdkDsl CfnEncryptionConfiguration.() -> Unit = {},
): CfnEncryptionConfiguration = CfnEncryptionConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEncryptionConfiguration(id: String, initializer: @AwsCdkDsl CfnEncryptionConfiguration.Builder.() -> Unit = {}): CfnEncryptionConfiguration = CfnEncryptionConfiguration.Builder.create(this, id).apply(initializer).build()
