package com.faendir.awscdkkt.generated.services.invoicing

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.invoicing.CfnProcurementPortalPreference
import software.amazon.awscdk.services.invoicing.CfnProcurementPortalPreferenceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProcurementPortalPreference(
  id: String,
  props: CfnProcurementPortalPreferenceProps,
  initializer: @AwsCdkDsl CfnProcurementPortalPreference.() -> Unit = {},
): CfnProcurementPortalPreference = CfnProcurementPortalPreference(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProcurementPortalPreference(id: String, initializer: @AwsCdkDsl CfnProcurementPortalPreference.Builder.() -> Unit = {}): CfnProcurementPortalPreference = CfnProcurementPortalPreference.Builder.create(this, id).apply(initializer).build()
