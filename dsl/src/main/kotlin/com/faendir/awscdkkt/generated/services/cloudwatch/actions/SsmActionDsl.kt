package com.faendir.awscdkkt.generated.services.cloudwatch.actions

import javax.`annotation`.Generated
import software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory
import software.amazon.awscdk.services.cloudwatch.actions.OpsItemSeverity
import software.amazon.awscdk.services.cloudwatch.actions.SsmAction

@Generated
public fun ssmAction(severity: OpsItemSeverity): SsmAction = SsmAction(severity)

@Generated
public fun ssmAction(severity: OpsItemSeverity, category: OpsItemCategory): SsmAction =
    SsmAction(severity, category)
