package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataCatalogEncryptionSettings(
  id: String,
  props: CfnDataCatalogEncryptionSettingsProps,
  initializer: @AwsCdkDsl CfnDataCatalogEncryptionSettings.() -> Unit = {},
): CfnDataCatalogEncryptionSettings = CfnDataCatalogEncryptionSettings(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataCatalogEncryptionSettings(id: String, initializer: @AwsCdkDsl CfnDataCatalogEncryptionSettings.Builder.() -> Unit = {}): CfnDataCatalogEncryptionSettings = CfnDataCatalogEncryptionSettings.Builder.create(this, id).apply(initializer).build()
