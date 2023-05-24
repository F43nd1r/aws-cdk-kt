package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupPlanRule
import software.amazon.awscdk.services.backup.BackupPlanRuleProps

@Generated
public fun backupPlanRule(props: BackupPlanRuleProps): BackupPlanRule = BackupPlanRule(props)

@Generated
public fun buildBackupPlanRule(initializer: @AwsCdkDsl BackupPlanRule.Builder.() -> Unit):
    BackupPlanRule = BackupPlanRule.Builder.create().apply(initializer).build()
