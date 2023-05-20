@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps
import software.constructs.Construct

public fun Construct.cfnDataCatalogEncryptionSettings(
  id: String,
  props: CfnDataCatalogEncryptionSettingsProps,
  initializer: CfnDataCatalogEncryptionSettings.() -> Unit = {},
): CfnDataCatalogEncryptionSettings = CfnDataCatalogEncryptionSettings(this, id,
    props).apply(initializer)
