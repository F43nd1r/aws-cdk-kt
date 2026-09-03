package com.faendir.awscdkkt.generated.services.licensemanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnLicenseAssetRuleSet
import software.amazon.awscdk.services.licensemanager.CfnLicenseAssetRuleSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLicenseAssetRuleSet(
  id: String,
  props: CfnLicenseAssetRuleSetProps,
  initializer: @AwsCdkDsl CfnLicenseAssetRuleSet.() -> Unit = {},
): CfnLicenseAssetRuleSet = CfnLicenseAssetRuleSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLicenseAssetRuleSet(id: String, initializer: @AwsCdkDsl CfnLicenseAssetRuleSet.Builder.() -> Unit = {}): CfnLicenseAssetRuleSet = CfnLicenseAssetRuleSet.Builder.create(this, id).apply(initializer).build()
